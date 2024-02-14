module d_latch_ctrl (
    input D,
    input En,
    output reg Q
);

always @(posedge En) begin
    Q<=D;
end
endmodule 