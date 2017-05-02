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
echo "xvlog -m64 --relax -prj DU_tb_vlog.prj"
ExecStep $xv_path/bin/xvlog -m64 --relax -prj DU_tb_vlog.prj 2>&1 | tee compile.log
