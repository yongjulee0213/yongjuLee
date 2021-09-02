//
//	Lab. 1 source code
//

#define F_CPU 16000000UL  // 1 MHz

#include <avr/io.h>		// Atmega에서 사용하는 각종 환경 변수 설정하는 header 파일
#include <util/delay.h>
#include <compat/twi.h>
#include <stdio.h>
#include <avr/interrupt.h>
#include <string.h>
#include <avr/signal.h>
#include <stdlib.h>
#include <math.h>

void uart0_init(void)
{
    DDRE &= ~(_BV(0));  // Rx0
	DDRE |= _BV(1);     // Tx0
	UCSR0B = 0x00; // interrupt disable while setting baud rate
	UCSR0A = 0x00; // Asynchronous Normal Mode
	UCSR0C = 0x06; // 비동기 방식, No parity bit, 1 stop bit 
	UBRR0L = 0x67;  // set baud rate 0x67 for 9600bps, 0x33 for 19200, 0x19 for 38400,  0x6 for 115200bps
	UBRR0H = 0x00; // 
	UCSR0B = 0x08; // transmitter enable only
}

//int putchar(char c)
int uart0_putchar(char c)
{
	UCSR0A = UCSR0A | 0x40;
	UDR0 = c;
	while(!(UCSR0A & 0x40));
}

//int getchar(void)
int uart0_getchar(void)
{
	char c;
	while(!(UCSR0A & 0x80));
	c = UDR0;
	uart0_putchar(c);
	return c;
}

void init_printf(void)
{
	uart0_init();
	fdevopen(uart0_putchar, uart0_getchar);
}



/////////////  main program  ////////////////////////

int main(void)
{
	int i,j;
	long a;

	// MCU 초기화
	MCUCR = 0x00;	    // disenable external memory and I/O
    XMCRB = 0x00;	    // disenable bus keeper

    init_printf();      // printf를 사용하기 위한 초기화
	
	j = 0;
	a = 1;

 	for(i=1; i< 11; i++)
	{
		j = j + i;
		a = a * i;
		printf("i: %d, j: %d, a: %ld\n",i,j,a);
	}

	while(1) {  }

	return(1);

}
