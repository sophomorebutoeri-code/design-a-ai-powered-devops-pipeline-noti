data class PipelineNotification(
    val pipelineName: String,
    val stage: String,
    val status: Status,
    val notifyChannels: List<NotificationChannel>
)

data class NotificationChannel(
    val type: ChannelType,
    val recipient: String
)

enum class Status {
    SUCCESS, FAILURE, RUNNING
}

enum class ChannelType {
    EMAIL, SLACK, TELEGRAM
}

data class AIInsight(
    val pipelineName: String,
    val anomalyDetection: Boolean,
    val performanceMetrics: PerformanceMetrics
)

data class PerformanceMetrics(
    val deploymentFrequency: Int,
    val leadTime: Int,
    val changeFailureRate: Double
)

data class DevOpsPipeline(
    val name: String,
    val stages: List<String>,
    val notifications: List<PipelineNotification>,
    val aiInsights: AIInsight
)