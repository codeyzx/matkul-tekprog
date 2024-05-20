public class LowCouplingExample {
    private DataFetcher dataFetcher;
    private DataProcessor dataProcessor;
    private DataExporter dataExporter;

    public LowCouplingExample(DataFetcher dataFetcher, DataProcessor dataProcessor, DataExporter dataExporter) {
        this.dataFetcher = dataFetcher;
        this.dataProcessor = dataProcessor;
        this.dataExporter = dataExporter;
    }

    public void processDataAndExport() {
        // Mengambil data
        String rawData = dataFetcher.fetchData();

        // Memproses data
        String processedData = dataProcessor.processData(rawData);

        // Ekspor data yang telah diproses
        dataExporter.exportData(processedData);
    }
}
