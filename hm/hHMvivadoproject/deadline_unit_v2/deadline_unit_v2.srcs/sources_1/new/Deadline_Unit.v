`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.05.2017 10:10:28
// Design Name: 
// Module Name: Deadline_Unit
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////


module Deadline_Unit(
   input reset,
   input overflow,
   input enable,
   input [31:0] deadline_hyp_to_HM,
   input [31:0] current_time,
   input [2:0] current_guest,
   input finish,
   input clk,
   output [2:0] tdi_error
    );
    
    reg [31:0] start_time;
    reg [31:0] stop_time;
    reg [31:0] run_time;
    reg [31:0] ran_time;
    reg [1:0] state;
    reg td_request;
    reg ed_request;
    reg ran_request;
    reg rw_signal;
    reg [31:0]i_data;
    wire [31:0]o_data;
    wire columm_auxx;
    
    reg [31:0] ran_time_deadline;
    reg [31:0] temporal_deadline;
    reg [31:0] guest_temporal [7:0];
    
    
    GDT ram_memory(
           .clock(clk),
           .guest_line(current_guestr),
           .GDT_column(columm_auxx),
           .RD0_WR1(rw_signal), //write 1
           .enable(enable),
           .i_data(i_data),
           .o_data(o_data)
           );   
            
    comparator_g guests (
                  .in1(current_guestr),
                  .in2(current_guest),
                  .out(out_comparator)
     );
     
    
assign current_guestr = reset ? 0 : (out_comparator) ? current_guestr : current_guest;   
                                  
always @(posedge clk)
begin 
                                            
if(reset) 
begin
start_time<=0;
stop_time<=0;
run_time<=0;
ran_time<=0;
tdi_aux<=0;
                                                 //first_cycle<=0;
                                                 //second_cycle<=0;
ran_time_deadline<=0;
temporal_deadline<=0;
guest_temporal [0]<=0;
guest_temporal [1]<=0;
guest_temporal [2]<=0;
guest_temporal [3]<=0;
guest_temporal [4]<=0;
guest_temporal [5]<=0;
guest_temporal [6]<=0;
guest_temporal [7]<=0;
 //check1<=0;
                                                 //check2<=0;
                                                 //check3<=0;
td_request<=0;
ed_request<=0;
ran_request=0;
rw_signal<=0;
state <= 0;
   end
end
                                     

endmodule

module comparator_g(
         input [2:0]in1,
         input [2:0]in2,
         output out
         );        
         assign out = (in1 == in2);      
 endmodule
 
module calculate(
        input i_guest_change,
        input i_predict,
        input [31:0] i_memory,
        input [31:0] i_current_time,
        input i_reset,
        output reg o_predic,
        output reg [31:0] o_ran_time,
        output reg [2:0] o_tdi_error
        );
 reg [31:0] start_time;
 reg [31:0] stop_time;
 reg [31:0] run_time;
 wire aux;
 assign aux = signal_from_predict;
 
 always @(i_guest_change)
 begin
    start_time = stop_time;
    stop_time = i_current_time;
    run_time = stop_time - start_time;
    
    o_ran_time = run_time + o_ran_time;
    if(i_memory > o_ran_time)
        o_tdi_error <= 3'b001;
    o_predic <= 1;
 end
endmodule

module predict(
        input signal_predict,
        input [31:0] from_memory_ran,
        input [31:0] from_memory_temporal,
        input [31:0] from_calculate,
        input [31:0] current_time,
        output reg [2:0] tdi_error,
        output reg signal_to_calculate
        );
 reg [31:0] check1;
 reg [31:0] check2;
 
 always @(signal_predict)
 begin
    check1 = from_memory_temporal - current_time;
    check2 = from_memory_ran - from_calculate;
    
    if(check1 > check2)
      tdi_error <= 3'b010;
      
    signal_to_calculate <= 0;
 end
endmodule
        