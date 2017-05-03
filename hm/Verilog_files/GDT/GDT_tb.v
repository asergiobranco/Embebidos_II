`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 29.04.2017 15:02:30
// Design Name: 
// Module Name: GDT_tb
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


module GDT_tb;
    
    reg clck;
    reg ena;
    reg [2:0] line;
    reg [2:0] column;
    reg wr_ena;
    reg [31:0]input_data;
    wire  [31:0]output_data;
        
    GDT GDT_TEST(
        .clock(clck),
        .guest_line(line),
        .GDT_column(column),
        .RD0_WR1(wr_ena),
        .enable(ena),
        .i_data(input_data),
        .o_data(output_data)  
    );
    
    initial
    begin
        ena <= 1;
        clck <= 0;
        
        #30
        line <= 0;
        column <= 1;
        wr_ena <= 1;
        input_data <= 32'b1111_0000_1111_1111_1111_1111_1111_1111;
        #60
        line <= 0;
        column <= 1;
        wr_ena <= 0;
    end
    
    always @ ( * )
    begin
    #10
        clck <= ~clck;
    end   

endmodule
