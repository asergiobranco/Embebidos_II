vlib work
vlib msim

vlib msim/processing_system7_bfm_v2_0_5
vlib msim/xil_defaultlib

vmap processing_system7_bfm_v2_0_5 msim/processing_system7_bfm_v2_0_5
vmap xil_defaultlib msim/xil_defaultlib

vlog -work processing_system7_bfm_v2_0_5 -64 -incr "+incdir+../../../../SecureBoot.srcs/sources_1/bd/zybo_design_1/ipshared/7dd0/hdl" "+incdir+../../../../SecureBoot.srcs/sources_1/bd/zybo_design_1/ipshared/7dd0/hdl" \
"../../../../SecureBoot.srcs/sources_1/bd/zybo_design_1/ipshared/7dd0/hdl/processing_system7_bfm_v2_0_vl_rfs.v" \

vlog -work xil_defaultlib -64 -incr "+incdir+../../../../SecureBoot.srcs/sources_1/bd/zybo_design_1/ipshared/7dd0/hdl" "+incdir+../../../../SecureBoot.srcs/sources_1/bd/zybo_design_1/ipshared/7dd0/hdl" \
"../../../bd/zybo_design_1/ip/zybo_design_1_processing_system7_0_0/sim/zybo_design_1_processing_system7_0_0.v" \
"../../../bd/zybo_design_1/hdl/zybo_design_1.v" \

vlog -work xil_defaultlib "glbl.v"

