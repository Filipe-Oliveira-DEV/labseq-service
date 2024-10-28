package com.labseq.labseqservice.controller;

import com.labseq.labseqservice.service.LabSeqService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/labseq")
public class LabSeqController {

    private final LabSeqService labSeqService;

    public LabSeqController(LabSeqService labSeqService) {
        this.labSeqService = labSeqService;
    }

    @Operation(
            summary = "Get LabSeq value at index n",
            description = "Returns the LabSeq value for the given index."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved LabSeq value"),
            @ApiResponse(responseCode = "400", description = "Invalid input provided"),
            @ApiResponse(responseCode = "404", description = "Value not found")
    })
    @GetMapping("/{n}")
    public long getLabSeqValue(@PathVariable int n) {
        return labSeqService.getLabSeq(n);
    }
}
