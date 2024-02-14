`include "counter.v"
module upcounter_testbench();
reg clk, reset;
wire [2:0] counter;

up_counter dut(clk, reset, counter);
initial begin 
clk=0;
forever #5 clk=~clk;
end
initial begin
    $dumpfile("out.vcd");
    $dumpvars(0, upcounter_testbench);
reset=1;
#15;
reset=0;
#200;
$finish;
reset=0;
end
endmodule 