#include <sonde2.h>
#include <math.h>
/*
#INT_TIMER1
void  TIMER1_isr(void) 
{

}

#INT_RDA
void  RDA_isr(void) 
{

}
*/
void main()
{
   setup_adc_ports(AN0);
   setup_adc(ADC_CLOCK_INTERNAL);
   set_adc_channel(0);
   setup_timer_0(RTCC_INTERNAL|RTCC_DIV_1|RTCC_8_BIT);      //51,2 us overflow
   setup_timer_1(T1_INTERNAL|T1_DIV_BY_8);      //104 ms overflow


   enable_interrupts(INT_TIMER1);
   enable_interrupts(INT_RDA);
   enable_interrupts(GLOBAL);
   setup_low_volt_detect(FALSE);

   while(TRUE){
   
      int temp_num =read_adc()/2;
      int digit = temp_num%10;
      output_d(digit);
      digit=((temp_num-digit)/10)%10;
      output_d(digit<<4);
      delay_ms(100);
        

   }
}
