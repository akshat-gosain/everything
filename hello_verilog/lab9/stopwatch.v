module jkff(clk, reset, j, k, q);
input clk,reset,j,k;
output reg q;
always@(posedge clk or reset)
begin
    
    if(reset)
    begin
        q <= 1'b0;
    end
    else
    begin
        if(j == 1'b0 && k == 1'b1) q <= 1'b0;
        if(j == 1'b1 && k == 1'b0) q <= 1'b1;
        if(j == 1'b1 && k == 1'b1) q <= !q; 
    end
end
endmodule


module FSM(reset,start,stop,clear,freeze,clr,count);
input start,stop,reset,clear;
output reg freeze,clr,count;
reg [1:0] state,nextstate;
always@(start,stop,clear)
begin
    if(start == 1'b1) nextstate <= 2'b01;
    if(stop == 1'b1 && state == 2'b01) nextstate <= 2'b10;
    if(clear == 1'b1) nextstate <= 2'b00;
end
always@(nextstate or reset)
begin
    if(reset) nextstate <= 2'b00;
    state = nextstate;
    case(state)
    2'b00: begin
        clr = 1'b1;
        freeze = 1'b0;
        count = 1'b1;
    end
    2'b01: begin
        count = 1'b1;
        clr = 1'b0;
        freeze = 1'b0;
    end
    2'b10: begin
        count = 1'b1;
        freeze = 1'b1;
        clr = 1'b0;
    end
    endcase
end
endmodule

module stopwatch(clk,reset,start,stop,clear,out);
input reset,start,clear,clk,stop;
output [3:0] out;
wire a,b,c,d;
wire ja,jb,jc,jd,ka,kb,kc,kd;
FSM fsm(reset,start,stop,clear,freeze,clr,count);
and (ja,b,c,d,!freeze,!clr);
or (ka,ja,clr);
and (jb,c,d,!freeze,!clr);
or (kb,jb,clr);
and (jc,d,!freeze,!clr);
or (kc,jc,clr);
and (jd,!freeze,!clr);
or (kd,jd,clr);
jkff A(clk & count,reset,ja,ka,a);
jkff B(clk & count,reset,jb,kb,b);
jkff C(clk & count,reset,jc,kc,c);
jkff D(clk & count,reset,jd,kd,d);
and(out[0],d,1'b1);
and(out[1],c,1'b1);
and(out[2],b,1'b1);
and(out[3],a,1'b1);
endmodule

