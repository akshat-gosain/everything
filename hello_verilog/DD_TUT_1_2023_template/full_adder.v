`include "half_adder.v"
module full_adder(input A,input B,input C0,output C1,output S);
//    wire x1;
//    wire a1,a2,a3;
//    wire o1;
//    xor xor1 (x1,A,B);
//    xor xor2 (S,x1,C0);

//    and and1 (a1,A,B);
//    and and2 (a2,B,C0);
//    and and3 (a3,A,C0);

//    or or1(o1,a1,a2);
//    or or2(C1,o1,a3);

//or via different method
// assign S = A ^ B ^ C0;
// assign C1 = (A&&B)||(B&&C0)||(C0&&A);


wire CMID;
wire w1,w2;
half_adder h1(A,B,CMID,W1);
half_adder h2(C0,W1,W2,S);
or o1(C1,CMID,W1);


endmodule
