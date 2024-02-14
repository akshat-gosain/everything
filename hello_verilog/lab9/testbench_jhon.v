`include "jhonson.v"

module tb;    
  
  reg clk;  
  reg rstn;  
  wire [3:0] out;  
  
  johnson_ctr   u0 (.clk (clk),  
                .rstn (rstn),  
                .out (out));  
  
  always #10 clk = ~clk;  
  
  initial begin  
    {clk, rstn} <= 0;  
  
    $monitor ("T=%0t out=%b", $time, out);  
    repeat (2) @(posedge clk);  
    rstn <= 1;  
    repeat (15) @(posedge clk);  
    $finish;  
  end  

  initial begin 
    $dumpfile("out.vcd"); $dumpvars;
  end
endmodule  
