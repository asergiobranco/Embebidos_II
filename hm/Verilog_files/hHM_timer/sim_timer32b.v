`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04/27/2017 11:08:40 AM
// Design Name: 
// Module Name: sim_timer32b
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


module sim_timer32b(
    );
    reg o_reset;
    reg o_clock;
    reg o_clearw;
    reg display_time;
    reg o_enable;
    wire [31:0] timer_currentvalue;
    wire overflow;
    
    timer32b uut(
    .i_clock(o_clock),
    .i_reset(o_reset),
    .i_clearw(o_clearw),
    .i_showtime(display_time),
    .i_enable(o_enable),
    .o_currentv(timer_currentvalue),
    .o_overflow(overflow)
    );
    
initial begin
    #10
    o_clock = 0;
    o_reset = 1;
    display_time=1;
    
    #15;
    o_reset = 0;
    o_enable = 1;   
    
end 
    
always #1 o_clock <= ~o_clock;
always @(*) if(overflow) o_clearw<=1;
    
        
endmodule
