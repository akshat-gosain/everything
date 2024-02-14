`include "full_adder.v"
module t_function;
    wire S,C1;
    reg A,B,C0;
    parameter stop_time = 100;
    full_adder fa(A,B,C0,C1,S);
    initial #stop_time $finish;
        initial begin
            $dumpfile("out.vcd");
            $dumpvars(0,t_function);
                A=0;B=0;C0=0;
            #10 A=1;B=0;C0=0;
            #10 A=1;B=1;C0=0; 
            #10 A=0;B=1;C0=0;
            #10 A=0;B=0;C0=1;
            #10 A=1;B=0;C0=1;
            #10 A=1;B=1;C0=1; 
            #10 A=0;B=1;C0=1;
    end

    initial begin
        $monitor ("Time =%0d, A=%b, B=%b, C0=%b,C1=%b ,S=%b",$time,A,B,C0,C1,S);
    end
endmodule