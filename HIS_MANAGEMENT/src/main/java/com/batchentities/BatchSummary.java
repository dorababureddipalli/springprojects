package com.batchentities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BatchSummary {
	@Id
	private Integer summaryId;
	private String batchName;
	private Integer failTriggerCount;
	private Integer succTriggerCount;
	private Integer totalTriggerProcessed;
}
