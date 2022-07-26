package com.github.arucard21.dataset_discovery.objects;

public class MatchingResult {
	private long matched;
	private long domainRepresentationSize;
	private long datasetSize;
	private double similarityScore;

	public MatchingResult(long matched, long domainRepresentationSize, long datasetSize) {
		this.matched = matched;
		this.domainRepresentationSize = domainRepresentationSize;
		this.datasetSize = datasetSize;
	}

	public long getMatched() {
		return matched;
	}
	public void setMatched(long matched) {
		this.matched = matched;
	}
	public long getDomainRepresentationSize() {
		return domainRepresentationSize;
	}
	public void setDomainRepresentationSize(long domainRepresentationSize) {
		this.domainRepresentationSize = domainRepresentationSize;
	}
	public long getDatasetSize() {
		return datasetSize;
	}
	public void setDatasetSize(long datasetSize) {
		this.datasetSize = datasetSize;
	}
	public double getSimilarityScore() {
		return similarityScore;
	}
	public void setSimilarityScore(double similarityScore) {
		this.similarityScore = similarityScore;
	}
}
