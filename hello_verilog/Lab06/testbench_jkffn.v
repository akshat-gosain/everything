`include "jkflipflop_neg.v"
module testbench ();
reg j, k, clk, reset;
wire q;
jkflipflop_neg jkff(j, k, clk, reset, q);
initial begin
    $dumpfile("jkflipflop.vcd");
    $dumpvars(0,testbench);
    //test all possible inputs
    reset = 1'b0; clk = 1'b0; j = 1'bx; k = 1'bx; #10;
    reset = 1'b1; clk = 1'b0; j = 1'b1; k = 1'b0; #5;
    reset = 1'b1; clk = 1'b0; j = 1'b0; k = 1'b1; #5;
    reset = 1'b1; clk = 1'b0; j = 1'b0; k = 1'b1; #5;
    reset = 1'b1; clk = 1'b0; j = 1'b1; k = 1'b1; #5;
    reset = 1'b1; clk = 1'b0; j = 1'b1; k = 1'b1; #5;
    reset = 1'b1; clk = 1'b0; j = 1'b0; k = 1'b0; #5;

    $finish;
end
initial begin
        $monitor("time: %0d reset = %b  j = %b k = %b Q = %b",$time,reset,j,k,q);
    end
endmodule