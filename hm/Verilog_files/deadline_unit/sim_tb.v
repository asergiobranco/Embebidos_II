`timescale 1ns / 1ps

module DU_tb();

       reg reset;
       reg overflow;
       reg enable;
       reg [31:0] data;
       reg [31:0] current_time;
       reg [2:0] current_guest;
       wire finish;
       reg clk;
       wire [2:0] tdi_error;


Deadline_Unit DU_test(
       .reset(reset),
       .overflow(overflow),
       .enable(enable),
       .deadline_hyp_to_HM(data),
       .current_time(current_time),
       .current_guest(current_guest),
       .finish(finish),
       .clk(clk),
       .tdi_error(tdi_error)
    );

    
    initial
    begin $monitor ("TDI ERROR=%b",tdi_error );
            reset <= 0;
            clk <= 0;
            overflow <= 0;
            current_time <= 0;
            data <= 0;
            
        #15
            reset <= 1;
            enable <= 1;
             
        #25
            reset <= 0;
            current_guest <= 1; 

        #35    
            current_guest <= 3;
        #40
            current_guest <= 2;
        #60
            current_guest <= 1;
    end
    
    always @ ( * )
    begin
            #10
            current_time <= current_time + 1;
            clk <= ~clk;
    end   
    


endmodule
