module sr_latch_ctrl (
    input S,
    input R,
    input En,
    output reg Q
);

always @(posedge En) begin
    if(S) begin
        Q<=1'b1;
    end
    else if (R) begin
        Q<=1'b0;
    end
end
endmodule