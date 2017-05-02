#!/bin/bash -f
xv_path="/home/miguel/Vivado/2016.4"
ExecStep()
{
"$@"
RETVAL=$?
if [ $RETVAL -ne 0 ]
then
exit $RETVAL
fi
}
ExecStep $xv_path/bin/xelab -wto 74fa5e268f0a43efbf035fcdbbeac3be -m64 --debug typical --relax --mt 8 -L blk_mem_gen_v8_3_5 -L xil_defaultlib -L unisims_ver -L unimacro_ver -L secureip -L xpm --snapshot DU_tb_behav xil_defaultlib.DU_tb xil_defaultlib.glbl -log elaborate.log
