module traffic(input clk, input rst,output r,output y,output g);
    reg [2:0] curr_state;
    reg [2:0] next_state;
    always@(negedge clk,rst) begin
        if(rst)
            curr_state <= 3'b000;
        else begin
            if(curr_state == 3'b110 || curr_state == 3'b111)
                curr_state <= 3'b000;
            else if(curr_state == 3'b101)
                curr_state <= 3'b000;
            else 
                curr_state <= curr_state+3'd1;
        end
    end

    assign r = !curr_state[2] && !curr_state[1];
    assign y = !curr_state[2] && curr_state[1];
    assign g = curr_state[2] && !curr_state[1];
endmodule