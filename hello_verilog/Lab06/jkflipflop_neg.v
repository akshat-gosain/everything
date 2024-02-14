module jkflipflop_neg (
    input j,
    input k,
    input clk,
    input reset,
    output reg q
);

always @(negedge clk or posedge reset) begin
    if(reset)
    q<=1'b0;
    else if(j&&!k)
    q<=1'b1;
    else if(!j&&k)
    q<=0;
    else if(j&&k)
    q<=!q;
end
    
endmodule