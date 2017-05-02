`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 29.04.2017 15:00:51
// Design Name: 
// Module Name: GDT
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

`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 28.04.2017 14:55:53
// Design Name: 
// Module Name: GDT
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
`define G0_BASEADDR 'h00
`define G1_BASEADDR 'h05
`define G2_BASEADDR 'h0F
`define G3_BASEADDR 'h14
`define G4_BASEADDR 'h19

`define RT_offset 'd0
`define ED_offset 'd1
`define TD_offset 'd2
`define EV_offset 'd3
`define TV_offset 'd4

module GDT(
    input clock,
    input [2:0] guest_line,
    input [2:0] GDT_column,
    input RD0_WR1,
    input enable,
    input [31:0]i_data,
    output[31:0]o_data
    );    
       
wire  w_enable, WR_enable;
wire [4:0] address;
wire [31:0]data_input;
wire [31:0]data_output;

reg [7:0] baseaddress; 


always @( * )
begin
 case (guest_line)
     3'b000 : baseaddress <= `G0_BASEADDR;
     3'b001 : baseaddress <= `G1_BASEADDR;
     3'b010 : baseaddress <= `G2_BASEADDR;
     3'b011 : baseaddress <= `G3_BASEADDR;
     default: baseaddress <= `G0_BASEADDR;
 endcase
 end

assign address = baseaddress +  GDT_column;
assign WR_enable = RD0_WR1;
assign w_enable = enable;

blk_mem_gen_0 GDT_memory (
      .clka(clock),
      .ena(w_enable),
      .wea(WR_enable),
      .addra(address),
      .dina(i_data),
      .douta(o_data)
    );
    
endmodule
