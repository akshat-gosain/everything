`include "sr_latch_ctrl.v"
module sr_latch_tb ();
reg S, R, En;
wire Q;
sr_latch_ctrl dut(.S(S), .R(R), .En(En), .Q(Q));
initial begin
    $dumpfile("sr_latch_ctrl.vcd");
    $dumpvars(1);
    //test all possible inputs
    S = 1'b1; R = 1'b0; En = 1'b1; #5;
    S = 1'b0; R = 1'b0; En = 1'b1; #5;
    S = 1'bx; R = 1'bx; En = 1'b0; #5;
    S = 1'b0; R = 1'b1; En = 1'b1; #5;
    S = 1'b0; R = 1'b0; En = 1'b1; #5;
    S = 1'bx; R = 1'bx; En = 1'b0; #5;
    S = 1'b1; R = 1'b1; En = 1'b1; #5;
    $finish;
end
initial begin
        $monitor("S = %b R = %b  En = %b Q = %b",S,R,En,Q);
    end
endmodule
