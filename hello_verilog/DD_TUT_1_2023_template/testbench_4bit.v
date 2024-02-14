`include "4bit_adder.v"
module t_function;
    wire[3:0] O;
    wire C1;
    reg[3:0] A,B;
    reg C0;
    parameter stop_time = 100;
    bit4_adder b1(A,B,C0,O,C1);
    initial #stop_time $finish;
        initial begin
            $dumpfile("out.vcd");
            $dumpvars(0,t_function);
                A=4'b0000;B=4'b0000;C0=0;
            #10 A=4'b0000;B=4'b0001;C0=1;
            #10 A=4'b0000;B=4'b0001;C0=0; 
            #10 A=4'b1001;B=4'b0001;C0=1;
            #10 A=4'b1100;B=4'b1001;C0=0; 
            #10 A=4'b1101;B=4'b1100;C0=0; 
            #10 A=4'b1110;B=4'b0111;C0=1; 
            
    end

    initial begin
        $monitor ("Time =%0d, A=%b, B=%b, C0=%b,C1=%b ,S=%b",$time,A,B,C0,C1,O);
    end
endmodule