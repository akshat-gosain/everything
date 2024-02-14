#include <stdio.h>
#include <string.h>

int main()
{
	char str[]="pks";
    str[0]='a';
	printf("%ld\n",strlen(str));
	return 0;
} 