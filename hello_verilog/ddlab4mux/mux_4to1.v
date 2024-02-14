module mux_4to1(input [3:0]in,input [1:0] select,output out);

    wire a1,a2,a3,a4;
    wire n_s0,n_s1;

    assign n_s0 = (!select[0]);
    assign n_s1 = (!select[1]);

    and and1(a1,n_s1,n_s0,in[0]);
    and and2(a2,n_s1,select[0],in[1]);
    and and3(a3,select[1],n_s0,in[2]);
    and and4(a4,select[1],select[0],in[3]);
    
    or or1(out,a1,a2,a3,a4);

endmodule