`include "L6dff.v"
module testbench ();
reg d, clk, reset;
wire q, qn;

L6dff dut(clk, reset, d, q, qn);
always #10 clk = ~clk;
initial begin
    $dumpfile("L6dout.vcd");
    $dumpvars(0,testbench);

    
        clk = 0; reset = 0; d = 0;

        #0 reset = 0; d = 0;
        #5 reset = 1; d = 0;
        #5 reset = 1; d = 1;
        #5 reset = 1; d = 0;
        #10 reset = 1; d = 1;
        #5 reset = 1; d = 1;
        #10 $finish;
    end

    initial begin
        $monitor($time, " Reset: %b D: %b  Q: %b Qn: %b",reset,d,q,qn);
    end
endmodule