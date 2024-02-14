`include "tflipflop_neg.v"
module testbench ();
reg t, clk, reset;
wire q;
tflipflop_neg tff(t, clk, reset, q);
initial begin
    $dumpfile("tflipflop.vcd");
    $dumpvars(0,testbench);
    clk = 1'b0; #10
    //test all possible inputs
    reset = 1'b0;  t = 1'b0; #5;
    reset = 1'b1; clk = 1'b0; t = 1'b1; #5;
    reset = 1'b1; clk = 1'b0; t = 1'b1; #5;
    reset = 1'b1; clk = 1'b0; t = 1'b0; #5;
    reset = 1'b1; clk = 1'b0; t = 1'b0; #5;
    reset = 1'b1; clk = 1'b0; t = 1'b1; #5;
    $finish;
end
initial begin
        $monitor("reset = %b time: %0d t = %b Q = %b",reset,$time,t,q);
    end
endmodule