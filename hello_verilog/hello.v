module halfadder (
    a, b, sum, cout
);
input a, b;
output reg sum, cout;

always @(*) begin
    case ({a, b})
        2'b00: sum = 0;
        2'b01: sum = 1;
        2'b10: sum = 1;
        2'b11: sum = 0;
        default: sum = 0;
    endcase

    case ({a, b})
        2'b00: cout = 0;
        2'b01: cout = 0;
        2'b10: cout = 0;
        2'b11: cout = 1;
        default: cout = 0;
    endcase
end
endmodule
