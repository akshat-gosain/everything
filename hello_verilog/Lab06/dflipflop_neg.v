module dflipflop_neg (
    input d,
    input clk,
    input reset,
    output reg q
);
always @(negedge clk or posedge reset) begin
    if(reset)
    q<=1'b0;
    else
    q<=d;
end
    
endmodule