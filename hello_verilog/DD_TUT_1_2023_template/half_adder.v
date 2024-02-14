module half_adder(input A,input B,output C1,output S);
    assign S = (!A && B) || (A && !B);
    assign C1 = (A && B);
endmodule