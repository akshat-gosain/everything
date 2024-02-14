`include "flip_flop.v"
module testbench();
    wire Q;
    reg D;

    flip_flop dff(clk,D,Q);
    reg clk = 1'b0;
    always #10 clk = ~clk;
    initial begin
        $dumpfile("flip_flop.vcd");
        $dumpvars(0,testbench);

            D = 1'b1 ; 
        #10 D = 1'b0 ;
        #10 D = 1'b1 ; 
        #10 D = 1'b1 ; 
        #10 $finish;
    end

    initial begin
        $monitor("time : %0d clk :%d D : %d  Q : %d",$time,clk,D,Q);
    end
endmodule