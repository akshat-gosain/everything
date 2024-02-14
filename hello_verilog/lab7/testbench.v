`include "state_machine.v"
module testbench();
reg clk, reset;
wire r,y,g;

traffic traffic(clk, reset, r,y,g);
initial begin 
clk=0;
forever #5 clk=~clk;
end
initial begin
    $dumpfile("out.vcd");
    $dumpvars(0,testbench);
reset=1;
#10;
reset=0;
#200;
$finish;
reset=0;
end
endmodule 