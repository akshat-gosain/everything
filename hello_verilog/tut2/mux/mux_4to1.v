`include "mux_2to1.v"
module mux_4to1(input [3:0] in,input [1:0] select,output out);
    wire [1:0] m;

    mux_2to1 mux2(in[3:2],select[0],m[1]);
    mux_2to1 mux1(in[1:0],select[0],m[0]);
    
    mux_2to1 mux3(m,select[1],out);
endmodule