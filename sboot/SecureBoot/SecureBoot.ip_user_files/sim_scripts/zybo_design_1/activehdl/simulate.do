onbreak {quit -force}
onerror {quit -force}

asim -t 1ps +access +r +m+zybo_design_1 -pli "/home/jltm/Vivado/2016.4/lib/lnx64.o/libxil_vsim.so" -L processing_system7_bfm_v2_0_5 -L xil_defaultlib -L unisims_ver -L unimacro_ver -L secureip -O5 xil_defaultlib.zybo_design_1 xil_defaultlib.glbl

do {wave.do}

view wave
view structure

do {zybo_design_1.udo}

run -all

endsim

quit -force
