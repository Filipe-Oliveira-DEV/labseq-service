package com.labseq.labseqservice;

import com.labseq.labseqservice.service.LabSeqService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LabSeqServiceTest {

    private final LabSeqService labSeqService = new LabSeqService();

    @Test
    public void testGetLabSeqValue() {
        assertEquals(0, labSeqService.getLabSeq(0)); // LabSeq(0) = 0
        assertEquals(1, labSeqService.getLabSeq(1)); // LabSeq(1) = 1
        assertEquals(1, labSeqService.getLabSeq(2)); // LabSeq(2) = 1
        assertEquals(2, labSeqService.getLabSeq(3)); // LabSeq(3) = 2
        assertEquals(3, labSeqService.getLabSeq(4)); // LabSeq(4) = 3
        assertEquals(5, labSeqService.getLabSeq(5)); // LabSeq(5) = 5
        assertEquals(8, labSeqService.getLabSeq(6)); // LabSeq(6) = 8
        assertEquals(13, labSeqService.getLabSeq(7)); // LabSeq(7) = 13
        assertEquals(21, labSeqService.getLabSeq(8)); // LabSeq(8) = 21
        assertEquals(34, labSeqService.getLabSeq(9)); // LabSeq(9) = 34
        assertEquals(55, labSeqService.getLabSeq(10)); // LabSeq(10) = 55
    }

    @Test
    public void testGetLabSeqNegativeIndex() {
        assertThrows(IllegalArgumentException.class, () -> labSeqService.getLabSeq(-1));
    }
}
