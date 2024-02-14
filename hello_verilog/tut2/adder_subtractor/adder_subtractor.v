`include "adder_4bit.v"

module adder_subtract (input [3:0]A, input[3:0]B, input CTR,output [3:0]S, output sign,output c1);
    wire [3:0] x1,x2;
    wire [3:0] temp_sum;
    wire n_c1,c_out;

    xor xor1(x1[0],B[0],CTR);
    xor xor2(x1[1],B[1],CTR);
    xor xor3(x1[2],B[2],CTR);
    xor xor4(x1[3],B[3],CTR);

    adder a1(A,x1,CTR,temp_sum,c1);
    not(n_c1,c1);
    and(sign,n_c1,CTR);

    xor xor5(x2[0],temp_sum[0],sign);
    xor xor6(x2[1],temp_sum[1],sign);
    xor xor7(x2[2],temp_sum[2],sign);
    xor xor8(x2[3],temp_sum[3],sign);

    adder a2(4'b0000,x2,sign,S,cout);
endmodule