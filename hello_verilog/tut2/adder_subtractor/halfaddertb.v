`include "halfadder.v"
module halfaddertb;

reg a,b;
wire sum,cout;

halfadder h1(.a(a),.b(b),.sum(sum),.cout(cout));

initial begin
    $dumpfile("ha_out.vcd");
    $dumpvars(0,halfaddertb);
    a=1'b0;
    b=1'b0;
    #20
    a=1'b0;
    b=1'b1;
    #20;
    a=1'b1;
    b=1'b0;
    #20
    a=1'b1;
    b=1'b1;
    #20;

    $finish;
end
    
    initial begin
        $monitor("time : %0d A = %b B = %b  Sum = %b Cout = %b",$time,a,b,sum,cout);
    end

endmodule