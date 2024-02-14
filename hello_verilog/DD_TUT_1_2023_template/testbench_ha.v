`include "half_adder.v"
module t_function;
    wire C,S;
    reg A,B;
    parameter stop_time = 50;
    half_adder h1(A,B,C,S);
    initial #stop_time $finish;
        initial begin
            $dumpfile("out.vcd");
            $dumpvars(0,t_function);
                A=0;B=0;
            #10 A=1;B=0;
            #10 A=1;B=1; 
            #10 A=0;B=1;
    end

    initial begin
        $monitor ("Time =%0d, A=%b, B=%b, C=%b ,S=%b",$time,A,B,C,S);
    end
endmodule