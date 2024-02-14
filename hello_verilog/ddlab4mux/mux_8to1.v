`include "mux_2to1.v"
`include "mux_4to1.v"
module mux_8to1(input [7:0] in,input [2:0] select,output out);

    wire [1:0] m;

    mux_4to1 m1(in[7:4],select[1:0],m[1]);
    mux_4to1 m2(in[3:0],select[1:0],m[0]);

    mux_2to1 m3(m,select[2],out);

endmodule