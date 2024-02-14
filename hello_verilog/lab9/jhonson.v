module johnson_ctr  
  (  
    input clk,  
    input rstn,  
    output reg [3:0] out  
  );  
  genvar i;
  always @ (posedge clk) begin  
      if (!rstn)  
         out <= 1;  
      else begin  
        out[3] <= ~out[0];  
        out[0] <= out[1];
        out[1] <= out[2];
        out[2] <= out[3];
      end  
  end  
endmodule  
