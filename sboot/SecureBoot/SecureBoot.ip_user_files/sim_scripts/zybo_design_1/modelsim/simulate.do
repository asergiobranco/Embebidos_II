onbreak {quit -f}
onerror {quit -f}

vsim -voptargs="+acc" -t 1ps -pli "/home/jltm/Vivado/2016.4/lib/lnx64.o/libxil_vsim.so" -L processing_system7_bfm_v2_0_5 -L xil_defaultlib -L unisims_ver -L unimacro_ver -L secureip -lib xil_defaultlib xil_defaultlib.zybo_design_1 xil_defaultlib.glbl

do {wave.do}

view wave
view structure
view signals

do {zybo_design_1.udo}

run -all

quit -force
