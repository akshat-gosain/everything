module L6dff (
    input reset, input clk, input d, output reg q,  output reg qn
);

always @(negedge clk or posedge reset) begin
    if (reset) begin
        q <= 1'b0; qn <= 1'b1;
    end 
    else begin
        q<=d;
        qn<=~d;
    end
end
    
endmodule