module mux_2to1(input [1:0]in,input select,output out);

    wire a1,a2;
    wire n_s;
    assign n_s = (!select);
    
    and and1(a1,n_s,in[0]);
    and and2(a2,select,in[1]);

    or or1(out,a1,a2);

endmodule