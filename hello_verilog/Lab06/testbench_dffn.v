`include "dflipflop_neg.v"
module testbench ();
reg d, clk, reset;
wire q;
dflipflop_neg dff(d, clk, reset, q);
initial begin
    $dumpfile("dflipflop.vcd");
    $dumpvars(0,testbench);
    clk = 1'b0; #5
    //test all possible inputs
    reset = 1'b0;  d = 1'bx; #5;
    reset = 1'b1;  d = 1'b0; #5;
    reset = 1'b1;  d = 1'b1; #5;
    reset = 1'b1;  d = 1'b0; #10;
    reset = 1'b1;  d = 1'b1; #5;
    reset = 1'b1; d = 1'b1; #5;
    $finish;
end
initial begin
        $monitor("reset = %b time : %0d  d = %b Q = %b",reset,$time,d,q);
    end
endmodule