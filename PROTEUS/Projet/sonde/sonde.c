#include <sonde.h>



#INT_TIMER1
void  TIMER1_isr(void) 
{

}

#INT_RDA
void  RDA_isr(void) 
{

}

void main()
{
   setup_adc_ports(AN0_VREF_VREF);
   setup_adc(ADC_CLOCK_INTERNAL);

   enable_interrupts(INT_RTCC);
   enable_interrupts(INT_TIMER1);
   enable_interrupts(INT_RDA);
   enable_interrupts(GLOBAL);
   setup_low_volt_detect(FALSE);

   while(TRUE)
   {
      output_d(1001);

      //TODO: User Code
   }

}