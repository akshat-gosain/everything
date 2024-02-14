`include "d_latch_ctrl.v"
module d_latch_tb ();
reg D, En;
wire Q;
d_latch_ctrl dut(.D(D), .En(En), .Q(Q));
initial begin
    $dumpfile("d_latch_ctrl.vcd");
    $dumpvars(1);
    //test all possible inputs
    D = 1'b1; En = 1'b1; #5;
    D = 1'bx; En = 1'b0; #5;
    D = 1'b0; En = 1'b1; #5;
    D = 1'bx; En = 1'b0; #5;
    $finish;
end
initial begin
        $monitor("D = %b En = %b Q = %b",D,En,Q);
    end
endmodule
