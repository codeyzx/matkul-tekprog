public class HighCouplingExample {
    public void processDataAndExport() {
        // Mengambil data
        String rawData = DataFetcher.fetchData();

        // Memproses data
        String processedData = DataProcessor.processData(rawData);

        // Ekspor data yang telah diproses
        DataExporter.exportData(processedData);
    }
}
