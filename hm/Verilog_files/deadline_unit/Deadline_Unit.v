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
    wire [31:0] ran_time;
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
            
    guestcomp guests (
             .i_currentguest(current_guest),
             .o_out(o_signal),
             .i_reset(reset)
     );
     
     calculate ran_time_test(
             .i_guest_change(o_signal),
             .i_clear_predict(predict_siganl),
             .i_mem_deadline(mem_dead),
             .i_mem_ran_time(ran_time_atble),
             .i_current_time(current_time),
             .i_clock(clk),
             .i_reset(reset),
             .i_overflow(overflow),
             .o_ran_time(ran_time),
             .o_tdi_error(tdi_error)
             );
     
    
   
                                  
always @(posedge clk)
begin 
                                            
if(reset) 
begin
start_time<=0;
stop_time<=0;
run_time<=0;
//ran_time<=0;
                                                 //first_cycle<=0;                                                 //second_cycle<=0;
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

////////////////////////////// Comparate Guest ntestado ///////////////////////////
module guestcomp(
         input [2:0]i_currentguest,
         output o_out,
         input i_reset
         );
         reg [2:0] guest;        
         assign o_out = (i_currentguest == guest);
         
always @(i_currentguest) 
begin
if(i_reset) guest=0;
else if(i_currentguest!=o_out) guest=i_currentguest;
end
endmodule

//////////////////////////// calculate deadlines ntestado ////////////////////////// 
module calculate(
        input i_guest_change,
        input i_clear_predict,
        input [31:0] i_mem_deadline,
        input [31:0] i_mem_ran_time,
        input [31:0] i_current_time,
        input i_clock,
        input i_reset,
        input i_overflow,
        output reg [31:0] o_ran_time,
        output reg [2:0] o_tdi_error
        );
 reg [31:0] start_time;
 reg [31:0] stop_time;
 reg [31:0] calc_time;
 assign o_predict = i_clear_predict? 0:1'bz;
 
 always @(posedge i_clock)
 begin
    if(i_guest_change)
    begin
        start_time <= stop_time;
        stop_time <= i_current_time;
        calc_time <= stop_time - start_time;
        if(i_overflow) calc_time=32'HFFFF_FFFF-calc_time;
        if(i_mem_deadline > o_ran_time) o_tdi_error <= 3'b001;
        o_ran_time = calc_time + o_ran_time;
    end
 end
endmodule

///////////////////////////////////// refazer
/*module predict(
        input [31:0] i_mem_ran_dead,
        input [31:0] i_mem_temp_dead,
        input [31:0] i_mem_ran_time,
        input [31:0] current_time,
        output reg [2:0] tdi_error,
        output reg signal_to_calculate
        );
 reg [31:0] check1;
 reg [31:0] check2;
 
 always @(signal_predict)
 begin
    check1 = i_mem_temp_dead - current_time;
    check2 = i_mem_ran_dead - i_mem_ran_time;
    
    if(check1 > check2)
      tdi_error <= 3'b010;
 end
endmodule*/
        