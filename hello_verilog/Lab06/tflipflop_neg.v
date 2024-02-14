module tflipflop_neg (
    input t,
    input clk,
    input reset,
    output reg q
);
always @(negedge clk or posedge reset) begin
    if(reset)
    q<=1'b0;
    else if(t)
    q<=~q;
end
    
endmodule