module up_counter(input clk, reset, output[2:0] counter);
reg [2:0] counter_up;

// up counter
always @(posedge clk or reset)
begin
if(reset)
 counter_up <= 3'd0;
else
 if(counter_up == 3'd6 || counter_up == 3'd7)
    counter_up <= 3'd0;
    
 else counter_up <= counter_up + 3'd1;
end 
assign counter = counter_up;
endmodule