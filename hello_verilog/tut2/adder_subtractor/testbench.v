`include "adder_subtractor.v"
module testbench ();
    //inputs
    reg [3:0] t_A,t_B;
    reg CTR;

    //outputs
    wire [3:0] t_S;
    wire t_Cout,sign;

    adder_subtract as1( t_A, t_B,  CTR, t_S,  sign, t_Cout);
    initial begin
        $dumpfile("adder_out.vcd");
        $dumpvars(0,testbench);

            t_A = 4'b1111; t_B = 4'b0111; CTR = 1'b0;
        #10 t_A = 4'b0000; t_B = 4'b0001; CTR = 1'b1;
        #10 $finish;
    end

    initial begin
        $monitor("time : %0d A = %b B = %b CTR = %b  Sum = %b Cout = %b sign = %b",$time,t_A,t_B,CTR,t_S,t_Cout,sign);
    end
endmodule