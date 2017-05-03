`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: ESRG
// Engineer: Ricardo Roriz
// 
// Create Date: 04/27/2017 10:28:06 AM
// Design Name: 
// Module Name: timer32b
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


module timer32b(
    i_clock,
    i_reset,
    i_clearw,
    i_showtime,
    i_enable,
    o_currentv,
    o_overflow
    );
    input i_clock; 
    input i_enable;   
    input i_reset;
    input i_clearw;
    input i_showtime;
    output [31:0] o_currentv;
    output o_overflow;
    reg [31:0] timervalue;
    reg overflow;
    assign o_currentv = i_showtime? timervalue : 32'hzzzz_zzzz;
    assign o_overflow = overflow;
    
always @(posedge i_clock)
begin
    if(i_enable) timervalue <= (timervalue + 1); 
    if(timervalue == 32'hFFFF_FFFF)
    begin
        overflow <= 1;
        timervalue <= 0;
    end   
       if(i_reset) 
           begin 
               timervalue <= 0;
               overflow <= 0;
           end
       
       if(i_clearw) overflow <= 0;  

end

endmodule
